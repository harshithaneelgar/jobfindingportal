package com.JobFindingPlatform.JobFindingPlatform.Repository;

import com.JobFindingPlatform.JobFindingPlatform.Entity.SubscriptionPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionPlanRepository extends JpaRepository<SubscriptionPlan,Long> {

}
