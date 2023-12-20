package org.example.jpaapidemo.domain.tdginfo.service;

import org.example.jpaapidemo.domain.tdginfo.dto.response.TdgInfoResponse;


public interface TdgInfoService {
	TdgInfoResponse findAptCd(String aptCd);
	TdgInfoResponse findQueryDslAptCd(String aptCd);
}
