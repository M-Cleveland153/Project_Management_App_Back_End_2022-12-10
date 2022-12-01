package com.finalproject.finalproject.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.finalproject.finalproject.entities.Announcements;
import com.finalproject.finalproject.entities.Company;
import com.finalproject.finalproject.entities.User;
import com.finalproject.finalproject.exceptions.NotFoundException;
import com.finalproject.finalproject.mappers.AnnouncementsMapper;
import com.finalproject.finalproject.model.AnnouncementsRequestDto;
import com.finalproject.finalproject.model.AnnouncementsResponseDto;
import com.finalproject.finalproject.repositories.AnnouncementsRepository;
import com.finalproject.finalproject.repositories.CompanyRepository;
import com.finalproject.finalproject.repositories.UserRepository;
import com.finalproject.finalproject.services.AnnouncementsService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AnnouncementsServiceImpl implements AnnouncementsService {

	private final AnnouncementsRepository announcementRepository;
	private final AnnouncementsMapper announcementMapper;
	private final UserRepository userRepository;
	private final CompanyRepository companyRepository;

	@Override
	public AnnouncementsResponseDto createAnnouncement(AnnouncementsRequestDto announcementsRequestDto) {
		// TODO Auto-generated method stub
		if (announcementsRequestDto.getId() == null) {
			throw new NotFoundException("No announcements");
		}
		Announcements announcementToCreate = announcementMapper.dtoToEntity(announcementsRequestDto);

		User userOptional = userRepository
				.findByCredentialsUsername(announcementToCreate.getAuthor().getCredentials().getUsername());

		Optional<Company> companyOptional = companyRepository.findById(announcementToCreate.getCompany().getId());

		announcementToCreate.setAuthor(userOptional);

		announcementToCreate.setCompany(companyOptional.get());

		return announcementMapper.entityToDto(announcementRepository.saveAndFlush(announcementToCreate));

	}

	@Override
	public List<AnnouncementsResponseDto> getAllAnnouncementsByCompany(Long id) {
		// TODO Auto-generated method stub
		List<Announcements> companyAnnouncements = announcementRepository.findAll();

		List<Announcements> announcements = new ArrayList<>();
		for (Announcements a : companyAnnouncements) {
			if (a.getCompany().getId().equals(id)) {
				announcements.add(a);
			}
		}
		return announcementMapper.entitiesToDtos(announcements);
	}

}