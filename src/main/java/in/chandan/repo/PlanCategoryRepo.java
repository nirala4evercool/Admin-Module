package in.chandan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.chandan.entity.PlanCateogry;

public interface PlanCategoryRepo extends JpaRepository<PlanCateogry, Integer> {

}