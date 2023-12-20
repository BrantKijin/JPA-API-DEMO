package org.example.jpaapidemo.domain.tdginfo.repository.querydsl;

import org.example.jpaapidemo.domain.tdginfo.entity.TdgInfo;

public interface TdgInfoRepositoryCustom {
	TdgInfo findByQueryDslAptCd(String aptCd);
}
