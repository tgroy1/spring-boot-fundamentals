package com.tgroy.conferencedemo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity(name = "sessions")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "session_id")
    private Long sessionId;
    @Column(name = "session_name")
    private String sessionName;
    @Column(name = "session_description")
    private String sessionDesc;
    @Column(name = "session_length")
    private Integer sessionLength;

    @ManyToMany
    @JoinTable( name = "session_speakers",
                joinColumns = @JoinColumn(name = "session_id"),
                inverseJoinColumns = @JoinColumn(name = "speaker_id") )
    private List<Speaker> speakers;

    public Session() {
    }

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public String getSessionDesc() {
        return sessionDesc;
    }

    public void setSessionDesc(String sessionDesc) {
        this.sessionDesc = sessionDesc;
    }

    public Integer getSessionLength() {
        return sessionLength;
    }

    public void setSessionLength(Integer sessionLength) {
        this.sessionLength = sessionLength;
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }
}
