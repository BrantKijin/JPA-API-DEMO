package org.example.jpaapidemo.domain.tdginfo.repository;

import org.example.jpaapidemo.domain.tdginfo.entity.TdgInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TdgInfoRepository extends JpaRepository<TdgInfo, Long> {

	TdgInfo findByAptCd(String aptCd);
}