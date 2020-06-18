package com.jessica.userprofiledemo.bucket;

public enum BucketName {

    PROFILE_IMAGE("jessica-springboot-aws-frontend-20200617");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}