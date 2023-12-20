package org.example.jpaapidemo.domain.tdginfo.repository;

import org.example.jpaapidemo.domain.tdginfo.entity.TdgInfo;
import org.example.jpaapidemo.domain.tdginfo.repository.querydsl.TdgInfoRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TdgInfoRepository extends JpaRepository<TdgInfo, Long>, TdgInfoRepositoryCustom {

	TdgInfo findByAptCd(String aptCd);
}