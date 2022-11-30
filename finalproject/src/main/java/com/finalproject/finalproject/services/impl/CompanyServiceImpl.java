package com.finalproject.finalproject.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.finalproject.finalproject.model.CompanyResponseDto;
import com.finalproject.finalproject.services.CompanyService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService{@Override
    public CompanyResponseDto getCompanyById(Long companyId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<CompanyResponseDto> getAllCompanies() {
        // TODO Auto-generated method stub
        return null;
    }

}