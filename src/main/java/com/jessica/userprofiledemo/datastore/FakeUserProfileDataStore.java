package com.jessica.userprofiledemo.datastore;

import com.jessica.userprofiledemo.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
//        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "janetjones", null));
//        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "antoniojunior", null));

        USER_PROFILES.add(new UserProfile(UUID.fromString("14a73b83-4f02-46b7-950d-e09a2ded3842"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("52e4b5cf-c619-4040-9c67-568a03b86cf1"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
