package com.sixcandoit.plrecipe_place.feature.place.service;

import com.sixcandoit.plrecipe_place.feature.place.dto.CourseDTO;
import com.sixcandoit.plrecipe_place.feature.place.dto.PlaceDTO;
import com.sixcandoit.plrecipe_place.feature.place.entity.Course;
import com.sixcandoit.plrecipe_place.feature.place.entity.CourseAndPlace;
import com.sixcandoit.plrecipe_place.feature.place.entity.Place;

import java.util.List;

public interface CourseService {
    CourseAndPlace selectCoursePlaceByCourseId(int courseId);
    List<CourseDTO> selectCourseByMember(int memberId);
    List<Place> getPlacesByCourseName(int courseId);

    void registCourse(CourseAndPlace cp);
    void modifyCourse(CourseAndPlace cp);

    void deleteCourse(int courseId);
}
