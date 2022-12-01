package com.finalproject.finalproject.services;

import java.util.List;

import com.finalproject.finalproject.model.AnnouncementsRequestDto;
import com.finalproject.finalproject.model.AnnouncementsResponseDto;

public interface AnnouncementsService {

	AnnouncementsResponseDto createAnnouncement(AnnouncementsRequestDto announcementsRequestDto);

	List<AnnouncementsResponseDto> getAllAnnouncementsByCompany(Long companyId);

}
