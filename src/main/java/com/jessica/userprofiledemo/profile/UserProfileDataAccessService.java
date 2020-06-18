package com.jessica.userprofiledemo.profile;

import com.jessica.userprofiledemo.datastore.FakeUserProfileDataStore;
import com.jessica.userprofiledemo.datastore.PostgresUserProfileDataStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class UserProfileDataAccessService {
//    private final FakeUserProfileDataStore fakeUserProfileDataStore;
    private final PostgresUserProfileDataStore postgresUserProfileDataStore;

    public UserProfileDataAccessService(PostgresUserProfileDataStore postgresUserProfileDataStore) {
        this.postgresUserProfileDataStore = postgresUserProfileDataStore;
    }

    List<UserProfile> getUserProfiles(){
        return postgresUserProfileDataStore.getUserProfiles();
    }

    int updateUserProfileById(UUID id, UserProfile updatedUserProfile){
        return postgresUserProfileDataStore.updateUserProfileById(id, updatedUserProfile);
    }
//    @Autowired
//    public UserProfileDataAccessService(FakeUserProfileDataStore fakeUserProfileDataStore) {
//        this.fakeUserProfileDataStore = fakeUserProfileDataStore;
//    }

//    List<UserProfile> getUserProfiles() {
//        return fakeUserProfileDataStore.getUserProfiles();
//    }


}
