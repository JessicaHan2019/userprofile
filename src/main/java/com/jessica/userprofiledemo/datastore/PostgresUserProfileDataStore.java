package com.jessica.userprofiledemo.datastore;

import com.jessica.userprofiledemo.profile.UserProfile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class PostgresUserProfileDataStore {
    private final JdbcTemplate jdbcTemplate;

    public PostgresUserProfileDataStore(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<UserProfile> getUserProfiles(){
        final String sql =  "SELECT id, name, imageLink FROM userprofile";
        return jdbcTemplate.query(sql, (resultSet,i) -> {
            UUID id = UUID.fromString(resultSet.getString("id"));
            String name = resultSet.getString("name");
            String imageLink =  resultSet.getString("imageLink");
            return new UserProfile(id, name, imageLink);
        });
    }

    public int updateUserProfileById(UUID id, UserProfile updatedUserProfile){
        final String sql = "UPDATE userprofile SET id = ?, name = ?, imageLink = ? WHERE id = ?";

        jdbcTemplate.update(sql, id, updatedUserProfile.getUserName(), updatedUserProfile.getUserProfileImageLink().get(), id);

        return 0;
    }
}
