package com.finalproject.finalproject.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finalproject.finalproject.model.AnnouncementsRequestDto;
import com.finalproject.finalproject.model.AnnouncementsResponseDto;
import com.finalproject.finalproject.services.AnnouncementsService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping
("/announcements")
public class AnnouncementsController {
	
	private final AnnouncementsService announcementsService;
	
	@PostMapping("/create")
	public AnnouncementsResponseDto createAnnouncement(@RequestBody AnnouncementsRequestDto announcementsRequestDto) {
		return announcementsService.createAnnouncement(announcementsRequestDto);
	}

	@GetMapping("/{companyId}")
	public List<AnnouncementsResponseDto> getAllAnnouncementsByCompany(@PathVariable Long companyId){
		return announcementsService.getAllAnnouncementsByCompany(companyId);
	}
}
// 