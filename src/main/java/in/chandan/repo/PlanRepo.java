package in.chandan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.chandan.entity.Plan;

public interface PlanRepo extends JpaRepository<Plan, Integer> {

}