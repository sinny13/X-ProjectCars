package kr.mr.myapp;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import kr.mr.mapper.ReserveMapper;
import kr.mr.model.ReserveDTO;

@Controller
public class RevController {


	@Autowired
	private ReserveMapper reserveMapper;

	// 1일 예약 페이지 전환
	@RequestMapping("/OneDay.do")
	public String reserveOneDay(Model model) {
		return "reserve/DayReserve";

	}

	// 장기 예약 페이지 전환
	@RequestMapping("/LongDay.do")
	public String reserveLongDay(Model model) {
		return "reserve/LongReserve";

	}

	// 즉시예약 페이지 전환
	@RequestMapping("/revLongDay.do")
	public String reserveNow(Model model) {
		return "reserve/myNowReserv";

	}

	// 예약정보 입력 -> 결제
	@RequestMapping("/payment.do")
	public String reserveInsert(ReserveDTO dto, HttpSession session) {

		int cnt = reserveMapper.reserveInsert(dto);

		if (cnt > 0) { // 등록성공

			
			List<ReserveDTO> revList = reserveMapper.reserveList();
			
			session.setAttribute("1", "1 1!!");
			return "payment/payment";

			
			
			
		} else {
			session.setAttribute("1", "1 1!!");
			return "reserve/myNowReserv";

		}

	}

}
