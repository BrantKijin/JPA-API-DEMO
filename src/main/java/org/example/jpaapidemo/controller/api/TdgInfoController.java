package org.example.jpaapidemo.controller.api;

import org.example.jpaapidemo.common.dto.response.ApiResponse;
import org.example.jpaapidemo.domain.tdginfo.service.TdgInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.querydsl.core.util.StringUtils;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class TdgInfoController {

	private final TdgInfoService tdgInfoService;

	@GetMapping("/v1/tdginfo")
	public ApiResponse getInstallStatus(
		@RequestParam(value = "aptCd") String aptCd
	) {
		if(StringUtils.isNullOrEmpty(aptCd)){
			aptCd = "99999";
		}
		return ApiResponse.success(tdgInfoService.findAptCd(aptCd));
	}

	@GetMapping("/v1/tdginfo/querydsl")
	public ApiResponse getQuerydslInstallStatus(
		@RequestParam(value = "aptCd") String aptCd
	) {
		if(StringUtils.isNullOrEmpty(aptCd)){
			aptCd = "99999";
		}
		return ApiResponse.success(tdgInfoService.findQueryDslAptCd(aptCd));
	}
}
