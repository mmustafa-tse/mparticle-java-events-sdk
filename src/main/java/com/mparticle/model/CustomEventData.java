package com.mparticle.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CustomEventData
 */

public class CustomEventData extends CommonEventData {
  /**
   * Gets or Sets customEventType
   */
  public enum CustomEventType {
    NAVIGATION("navigation"),
    
    LOCATION("location"),
    
    SEARCH("search"),
    
    TRANSACTION("transaction"),
    
    USER_CONTENT("user_content"),
    
    USER_PREFERENCE("user_preference"),
    
    SOCIAL("social"),
    
    OTHER("other");

    private String value;

    CustomEventType(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CustomEventType fromValue(String value) {
      for (CustomEventType b : CustomEventType.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String SERIALIZED_NAME_CUSTOM_EVENT_TYPE = "custom_event_type";
  @SerializedName(SERIALIZED_NAME_CUSTOM_EVENT_TYPE)
  private CustomEventType customEventType = CustomEventType.OTHER;

  public static final String SERIALIZED_NAME_EVENT_NAME = "event_name";
  @SerializedName(SERIALIZED_NAME_EVENT_NAME)
  private String eventName;

  public static final String SERIALIZED_NAME_CUSTOM_FLAGS = "custom_flags";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FLAGS)
  private Map<String, String> customFlags = new HashMap<String, String>();

  public CustomEventData customEventType(CustomEventType customEventType) {
    this.customEventType = customEventType;
    return this;
  }

   /**
   * Get customEventType
   * @return customEventType
  **/
  @ApiModelProperty(required = true, value = "")
  public CustomEventType getCustomEventType() {
    return customEventType;
  }

  public void setCustomEventType(CustomEventType customEventType) {
    this.customEventType = customEventType;
  }

  public CustomEventData eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * Get eventName
   * @return eventName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public CustomEventData customFlags(Map<String, String> customFlags) {
    this.customFlags = customFlags;
    return this;
  }

  public CustomEventData putCustomFlagsItem(String key, String customFlagsItem) {
    if (this.customFlags == null) {
      this.customFlags = new HashMap<String, String>();
    }
    this.customFlags.put(key, customFlagsItem);
    return this;
  }

   /**
   * Get customFlags
   * @return customFlags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Map<String, String> getCustomFlags() {
    return customFlags;
  }

  public void setCustomFlags(Map<String, String> customFlags) {
    this.customFlags = customFlags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEventData customEventData = (CustomEventData) o;
    return Objects.equals(this.customEventType, customEventData.customEventType) &&
        Objects.equals(this.eventName, customEventData.eventName) &&
        Objects.equals(this.customFlags, customEventData.customFlags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customEventType, eventName, customFlags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEventData {\n");
    sb.append("    customEventType: ").append(toIndentedString(customEventType)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    customFlags: ").append(toIndentedString(customFlags)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

