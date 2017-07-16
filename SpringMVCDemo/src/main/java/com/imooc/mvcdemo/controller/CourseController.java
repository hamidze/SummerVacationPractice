package com.imooc.mvcdemo.controller;

import com.imooc.mvcdemo.model.Course;
import com.imooc.mvcdemo.service.CourseService;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * Created by Thpffcj on 2017/7/15.
 */
@Controller
@RequestMapping("/courses")
// /course/都会被拦截
public class CourseController {

    private static Logger log = LoggerFactory.getLogger(CourseController.class);

    private CourseService courseService;

    @Autowired
    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String viewCourse(@RequestParam("courseId") Integer courseId, Model model){
        log.debug("In viewCourse, courseId = {}", courseId);
        Course course = courseService.getCoursebyId(courseId);
        model.addAttribute(course);
        return "course_overview";
    }

    @RequestMapping(value = "/view2/{courseId}", method = RequestMethod.GET)
    public String viewCourse2(@PathVariable("courseId") Integer courseId, Map<String, Object> model){
        log.debug("In viewCourse, courseId = {}", courseId);
        Course course = courseService.getCoursebyId(courseId);
        model.put("course", course);
        return "course_overview";
    }

    @RequestMapping(value = "view3", method = RequestMethod.GET)
    public String viewCourse3(HttpServletRequest request){
        Integer courseId = Integer.valueOf(request.getParameter("courseId"));
        log.debug("In viewCourse, courseId = {}", courseId);
        Course course = courseService.getCoursebyId(courseId);
        request.setAttribute("course", course);
        return "course_overview";
    }

    @RequestMapping(value = "/admin" ,method = RequestMethod.GET, params = "add")
    public String createCourse(){
        return "course_admin/edit";
    }

    @RequestMapping(value = "/save" ,method = RequestMethod.POST)
    public String doSave(@ModelAttribute Course course){
        log.debug("Info of Course:");
        log.debug(ReflectionToStringBuilder.toString(course));
        course.setCourseId(123);
        return "redirect:view2/"+course.getCourseId();
    }

    @RequestMapping(value="/upload", method=RequestMethod.GET)
    public String showUploadPage(@RequestParam(value= "multi", required = false) Boolean multi){
        if(multi != null && multi){
            return "course_admin/multifile";
        }
        return "course_admin/file";
    }

    @RequestMapping(value = "/doUpload", method = RequestMethod.POST)
    public String doUploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        if(!file.isEmpty()){
            FileUtils.copyInputStreamToFile(file.getInputStream(), new File("C:\\Users\\Thpffcj\\Pictures\\Saved Pictures\\", System.currentTimeMillis()+file.getOriginalFilename()));
        }
        return "success";
    }

    @RequestMapping(value="/{courseId}",method=RequestMethod.GET)
    public @ResponseBody Course getCourseInJson(@PathVariable Integer courseId){
        return  courseService.getCoursebyId(courseId);
    }


    @RequestMapping(value="/jsontype/{courseId}",method=RequestMethod.GET)
    public ResponseEntity<Course> getCourseInJson2(@PathVariable Integer courseId){
        Course course =   courseService.getCoursebyId(courseId);
        return new ResponseEntity<Course>(course, HttpStatus.OK);
    }
}
