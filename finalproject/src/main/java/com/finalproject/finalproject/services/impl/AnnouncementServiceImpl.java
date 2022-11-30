package com.finalproject.finalproject.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.finalproject.finalproject.model.AnnouncementsRequestDto;
import com.finalproject.finalproject.model.AnnouncementsResponseDto;
import com.finalproject.finalproject.model.CredentialsDto;
import com.finalproject.finalproject.services.AnnouncementsService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AnnouncementServiceImpl implements AnnouncementsService{@Override
    public AnnouncementsResponseDto createAnnouncement(AnnouncementsRequestDto announcementsRequestDto,
            CredentialsDto credentialsDto) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<AnnouncementsResponseDto> getAllAnnouncementsByCompany(Long companyId) {
        // TODO Auto-generated method stub
        return null;
    }

}