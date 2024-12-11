package com.ohgiraffers.section03.annotationconfig.subsection01.java;

import com.ohgiraffers.common.MemberDAO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.*;

@Configuration("configuration03")
@ComponentScan(basePackages = "com.ohgiraffers",
excludeFilters = {
        @ComponentScan.Filter(
                //type = FilterType.ASSIGNABLE_TYPE, classes = {MemberDAO.class}
                //type = FilterType.ANNOTATION, classes = {org.springframework.stereotype.Component.class}
                type = FilterType.REGEX,
                pattern = {"com.ohgiraffers"}
        )
})
public class ContextConfiguration {

}
