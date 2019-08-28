package com.mparticle.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * ApplicationStateTransitionEvent
 */

public class ApplicationStateTransitionEvent {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private ApplicationStateTransitionEventData data = null;

  /**
   * Gets or Sets eventType
   */
  public enum EventTypeEnum {
    APPLICATION_STATE_TRANSITION("application_state_transition");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventTypeEnum fromValue(String value) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private EventTypeEnum eventType = EventTypeEnum.APPLICATION_STATE_TRANSITION;

  public ApplicationStateTransitionEvent data(ApplicationStateTransitionEventData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public ApplicationStateTransitionEventData getData() {
    return data;
  }

  public void setData(ApplicationStateTransitionEventData data) {
    this.data = data;
  }

  public ApplicationStateTransitionEvent eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public EventTypeEnum getEventType() {
    return eventType;
  }

  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationStateTransitionEvent applicationStateTransitionEvent = (ApplicationStateTransitionEvent) o;
    return Objects.equals(this.data, applicationStateTransitionEvent.data) &&
        Objects.equals(this.eventType, applicationStateTransitionEvent.eventType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, eventType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationStateTransitionEvent {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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

