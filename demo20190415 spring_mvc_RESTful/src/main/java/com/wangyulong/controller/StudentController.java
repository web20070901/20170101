package com.wangyulong.controller;

import com.wangyulong.bean.Student;
import com.wangyulong.vo.JsonResultVo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * REST架构风格的Controller
 * 特点是每一方法的默认返回值都是json对象
 */
@CrossOrigin
@RestController
@RequestMapping("student")
public class StudentController {

    //模拟数据库大量数据
    private List<Student> list = new ArrayList<>();
    {
        for (int i=0;i<100;i++) {
            Student student = new Student();
            student.setId(i+1);
            student.setName("小明"+i+1);
            student.setAge(""+i+1);
            list.add(student);
        }
    }

    /**
     * 根据id查询方法
     *
     * REST风格的地址中的一部分是我们需要的参数
     * REST风格，如果是查询资源，就应该是GET请求
     * @param id
     * @return
     */
    @RequestMapping(value = "{studentId}",method = RequestMethod.GET)
    public Student queryStudentById(@PathVariable("studentId") Integer id){
        Student student = list.get(id - 1);
        return student;
    }

    /**
     * 新增方法
     * @param student
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public JsonResultVo save(Student student){
        list.add(student);
        JsonResultVo jsonResultVo = new JsonResultVo();
        jsonResultVo.setCode(1);
        jsonResultVo.setMsg("新增成功");
        return jsonResultVo;
    }

    /**
     * 删除方法
     * @param id
     * @return
     */
    @RequestMapping(value = "/{studentId}",method = RequestMethod.DELETE)
    public JsonResultVo delete(@PathVariable("studentId") int id){
        list.remove(id);
        JsonResultVo jsonResultVo = new JsonResultVo();
        jsonResultVo.setCode(1);
        jsonResultVo.setMsg("删除成功");
        return jsonResultVo;
    }

    /**
     * 修改方法
     * @param student
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT)
    public JsonResultVo update(Student student){
        list.remove(student.getId()-1);
        list.set(student.getId()-1,student);
        JsonResultVo jsonResultVo = new JsonResultVo();
        jsonResultVo.setCode(1);
        jsonResultVo.setMsg("修改成功");
        return jsonResultVo;
    }

    /**
     * 分页查询
     * @param page
     * @return
     */
    @RequestMapping(value = "/page/{page}",method = RequestMethod.GET)
    public List<Student> queryStudentByPage(@PathVariable("page") int page){
        List<Student> students = list.subList((page - 1) * 5, page * 5);
        return students;
    }
}
