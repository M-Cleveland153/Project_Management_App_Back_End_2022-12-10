package com.finalproject.finalproject.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.finalproject.finalproject.entities.Announcements;
import com.finalproject.finalproject.model.AnnouncementsRequestDto;
import com.finalproject.finalproject.model.AnnouncementsResponseDto;

@Mapper(componentModel = "spring")
public interface AnnouncementsMapper {

	List<AnnouncementsResponseDto> entitiesToDtos(List<Announcements> announcements);

	Announcements dtoToEntity(AnnouncementsRequestDto announcementsRequestDto);

	AnnouncementsResponseDto entityToDto(Announcements saveAndFlush);
//
//	AnnouncementsResponseDto entityToDto(Announcements announcement);

}