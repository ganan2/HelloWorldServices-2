package com.helloworld.services.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document
public class About {
    @Id
    private String mongoId;
    private String aboutMessage;

    public String getMongoId() {
        return mongoId;
    }

    public void setMongoId(String mongoId) {
        this.mongoId = mongoId;
    }

    public String getAboutMessage() {
        return aboutMessage;
    }

    public void setAboutMessage(String aboutMessage) {
        this.aboutMessage = aboutMessage;
    }
}
