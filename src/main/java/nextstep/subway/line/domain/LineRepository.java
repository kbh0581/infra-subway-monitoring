package nextstep.subway.line.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LineRepository extends JpaRepository<Line, Long> {

	//@Query(value = "SELECT * FROM line WHERE SLEEP(3)", nativeQuery = true)
	List<Line> findAll();
}
