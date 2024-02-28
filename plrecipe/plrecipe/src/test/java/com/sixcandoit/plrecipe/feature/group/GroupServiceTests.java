package com.sixcandoit.plrecipe.feature.group;

import com.sixcandoit.plrecipe.feature.member.MemberDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class GroupServiceTests {
    @Autowired
    private Group groupService;

    @Test
    void testAllGroupSelect() {

        List<GroupDTO> group = groupService.selectAllGroup();
        group.forEach(System.out::println);

        assertNotNull(group);
    }

    @Test
    void testSelectMembersByGroupId() {
        int groupId = 1;

        List<MemberDTO> members = groupService.selectMembersByGroupId(groupId);

        assertNotNull(members);

        for (MemberDTO member : members) {
            System.out.println(member);
        }
    }
}
