package com.finalproject.finalproject.services;

import java.util.List;

import com.finalproject.finalproject.model.AnnouncementsRequestDto;
import com.finalproject.finalproject.model.AnnouncementsResponseDto;
import com.finalproject.finalproject.model.CredentialsDto;

public interface AnnouncementsService {

	AnnouncementsResponseDto createAnnouncement(AnnouncementsRequestDto announcementsRequestDto,
			CredentialsDto credentialsDto);

	List<AnnouncementsResponseDto> getAllAnnouncementsByCompany(Long companyId);

}
