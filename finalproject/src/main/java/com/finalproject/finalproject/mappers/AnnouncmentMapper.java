package com.finalproject.finalproject.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.finalproject.finalproject.model.AnnouncementsRequestDto;
import com.finalproject.finalproject.model.AnnouncementsResponseDto;
import com.finalproject.finalproject.entities.Announcements;

@Mapper(componentModel = "spring")
public interface AnnouncmentMapper {

    // Announcements dtoToEntity(AnnouncementsRequestDto);

    // AnnouncementsResponseDto entityToDto(Announcements entity);

    // List<AnnouncementsResponseDto> entitiesToDtos(List<Announcements> announcements);
}