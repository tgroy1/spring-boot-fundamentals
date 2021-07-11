package com.tgroy.trackzilla.service;

import java.util.List;

import com.tgroy.trackzilla.model.Application;

public interface ApplicationService {
    List<Application> listApplications();
    Application findApplication(long id);
}


