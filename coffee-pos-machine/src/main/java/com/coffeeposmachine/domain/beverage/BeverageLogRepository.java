package com.coffeeposmachine.domain.beverage;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BeverageLogRepository extends JpaRepository<BeverageLog, Long> {
}
