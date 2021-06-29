package com.stj.service;

import java.util.List;

import com.stj.entity.Application;

public interface ApplicationService {
    List<Application> listApplications();

    Application findApplication(long id);
}


