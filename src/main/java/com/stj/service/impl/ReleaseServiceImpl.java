package com.stj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stj.entity.Release;
import com.stj.repository.ReleaseRepository;
import com.stj.service.ReleaseService;


@Service
public class ReleaseServiceImpl implements ReleaseService {
    @Autowired
    private ReleaseRepository releaseRepository;

    @Override
    public List<Release> listReleases() {
        return (List<Release>) releaseRepository.findAll();
    }

}
