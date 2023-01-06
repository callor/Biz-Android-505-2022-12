package com.callor.student.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.callor.student.data.Student
import com.callor.student.databinding.StudentListItemBinding


/**
 * RecyclerView 에 데이터를 보여주기 위한
 * helper 클래스
 *
 *
 * 클래스를 상속받았을때 강제로 member 들을 implements 해야하는 경우가 있다
 * 이것은 원본 클래스가
 * 인터페이스 이거나 추상클래스 일 경우이다
 *
 * 클래스를 상속받았는데 오류가 발생하고
 * implements member 메시지가 나오면 method 를 추가하여
 * 코드를 작성해 주어야 한다.
 *
 */
class StudentRecyclerAdapter(
    private val studentList : LiveData<List<Student>> // 화면에 보여줄 데이터 받기
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    /**
     * fragment 나 activity 에서
     * xml 파일과 binding 을 연결하는 역할을 수행하는 함수
     * 여기는 RecyclerView 를 위해서 작동하는 함수
     * 여기에서 만든 binding 을 ViewHolder 에게 전달하여
     * Data 와 View 를 연결하기
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val studentHolder =
            StudentListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return StudentViewHolder(studentHolder)
    }

    // 개별 데이터와 view 를 연결하는 함수
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = studentList.value?.get(position)
        val stHolder = holder as StudentViewHolder
        stHolder.bind(item!!)
    }

//    override fun getItemCount(): Int {
//        return studentList.value?.size!!
//    }
    override fun getItemCount(): Int =
        if(studentList.value == null) 0 else studentList.value?.size!!

    fun modifyNotice () {
        notifyDataSetChanged()
    }

    /**
     * 리스트로 보여줄 개별 데이터의 view 를 설정하는 부분
     * 여기는 student_list_item.xml 을 binding 으로
     * 전달 받는다
     *
     * 그리고 상속받은 RecylerView.ViewHolder 에게
     * binding.root 를 전달해 준다다     */
    inner class StudentViewHolder(private val binding:StudentListItemBinding)
        : RecyclerView.ViewHolder(binding.root) {
            fun bind(student:Student) {
                /**
                 * 매개변수로 전달받은 student 객체와
                 * binding.stView 를 연결했다
                 *
                 * DataBinding 을 이용하여
                 * UI 와 viewModel 을 연동하기 위하셔
                 * Call By Ref 를 이용하는 방법
                 */
                binding.stView = student
            }
    }
}