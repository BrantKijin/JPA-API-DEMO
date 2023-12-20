package org.example.jpaapidemo.domain.tdginfo.service;

import org.example.jpaapidemo.domain.tdginfo.dto.response.TdgInfoResponse;
import org.example.jpaapidemo.domain.tdginfo.entity.TdgInfo;
import org.example.jpaapidemo.domain.tdginfo.repository.TdgInfoRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TdgInfoServiceImpl implements TdgInfoService{

	private final TdgInfoRepository tdgInfoRepository;

	@Override
	public TdgInfoResponse findAptCd(String aptCd) {
		TdgInfo byAptCd = tdgInfoRepository.findByAptCd(aptCd);
		return TdgInfoResponse.from(byAptCd);

	}

	@Override
	public TdgInfoResponse findQueryDslAptCd(String aptCd) {
		TdgInfo byQueryDslAptCd = tdgInfoRepository.findByQueryDslAptCd(aptCd);

		return TdgInfoResponse.from(byQueryDslAptCd);
	}
}
