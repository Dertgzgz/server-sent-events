package com.versia.sse.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Notification message
 * <p>
 * SCO Notification System for mobile devices
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "uuid",
        "type",
        "related",
        "createdAt",
        "originType",
        "action",
        "data"
})
public class Notification {

    /**
     * (Required)
     */
    @JsonProperty("uuid")
    private String uuid;
    /**
     * Notification type
     * (Required)
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Notification type")
    private Notification.Type type;
    @JsonProperty("related")
    private String related;
    /**
     * (Required)
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * Information origin type
     * (Required)
     */
    @JsonProperty("originType")
    @JsonPropertyDescription("Information origin type")
    private Notification.OriginType originType;
    /**
     * (Required)
     */
    @JsonProperty("action")
    private Notification.Action action;
    @JsonProperty("data")
    private Data data;

    /**
     * (Required)
     */
    @JsonProperty("uuid")
    public String getUuid() {
        return uuid;
    }

    /**
     * (Required)
     */
    @JsonProperty("uuid")
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * Notification type
     * (Required)
     */
    @JsonProperty("type")
    public Notification.Type getType() {
        return type;
    }

    /**
     * Notification type
     * (Required)
     */
    @JsonProperty("type")
    public void setType(Notification.Type type) {
        this.type = type;
    }

    @JsonProperty("related")
    public String getRelated() {
        return related;
    }

    @JsonProperty("related")
    public void setRelated(String related) {
        this.related = related;
    }

    /**
     * (Required)
     */
    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * (Required)
     */
    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Information origin type
     * (Required)
     */
    @JsonProperty("originType")
    public Notification.OriginType getOriginType() {
        return originType;
    }

    /**
     * Information origin type
     * (Required)
     */
    @JsonProperty("originType")
    public void setOriginType(Notification.OriginType originType) {
        this.originType = originType;
    }

    /**
     * (Required)
     */
    @JsonProperty("action")
    public Notification.Action getAction() {
        return action;
    }

    /**
     * (Required)
     */
    @JsonProperty("action")
    public void setAction(Notification.Action action) {
        this.action = action;
    }

    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }

    public enum Action {

        CREATE("create"),
        VALIDATE("validate"),
        DELETE("delete");
        private final String value;
        private final static Map<String, Notification.Action> CONSTANTS = new HashMap<String, Notification.Action>();

        static {
            for (Notification.Action c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Action(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Notification.Action fromValue(String value) {
            Notification.Action constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum OriginType {

        POS("pos"),
        CLIENT("client");
        private final String value;
        private final static Map<String, Notification.OriginType> CONSTANTS = new HashMap<String, Notification.OriginType>();

        static {
            for (Notification.OriginType c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private OriginType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Notification.OriginType fromValue(String value) {
            Notification.OriginType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum Type {

        AGE_CONFIRMATION("age-confirmation");
        private final String value;
        private final static Map<String, Notification.Type> CONSTANTS = new HashMap<String, Notification.Type>();

        static {
            for (Notification.Type c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Notification.Type fromValue(String value) {
            Notification.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}

