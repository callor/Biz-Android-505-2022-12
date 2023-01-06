package com.callor.list.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.callor.list.databinding.StudentListItemBinding
import com.callor.list.models.StudentDto

/**
 * Adapter 클래스
 * 복잡한 UI 구현하거나,
 * 복잡한 연산을 수행할때 기본 코드만으로 구현이 어려운 부분이 많다
 * 안드로이드 에서는 데이터를 RecyclerView 에 표현할때
 * 여러가지 잡다한 설정을 겁나게 해야 한다.
 * 이러한 설정을 하는 별도의 모듈을 생성해야 한다
 *
 * 설정을 별도로 만들도 연결하는 도구로 사용하는 클래스를
 * Helper class 라고한다 Adapter 클래스도 Helper 클래스 중의 하나이다
 * 다만 RecyclerViewAdapter 는 RecyclerVIew 만을 위하여
 * 작성하는 클래스 파일이다
 *
 *
 * implements member(method)
 * RecyclerViewAdapter 를 만들때는 RecyclerView.Adapter 클래스를 반드시 상속받고
 * 그리고 3개의 함수를 반드시 코딩 해야 한다.
 * 이 3개의 함수를 통하여 RecyclerView 의 item 들을 화면에 표시 할수 있다
 *
 * studentList:MutableList<StudentDto>
 * 학생정보들이 저장된 배열을 받아서 사용하겠다
 */
class StudentRecyclerAdapter(private val studentList: MutableList<StudentDto>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val viewHolder = StudentViewHolder(
            StudentListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
        return viewHolder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        //  List 에서 1개의 데이터를 추출하여
        val item = studentList[position]
        val stHolder = holder as StudentViewHolder

        // 개별데이터를 view 의 text 속성에 setting 하기
        stHolder.txtStName.text = item.name.toString()
        stHolder.txtStNum.text = item.num.toString()
        stHolder.txtStAddr.text = item.address.toString()
        stHolder.txtStTel.text = item.tel.toString()
    }

    // 전체 화면에 보일 데이터 개수를 return 하는 함수
    override fun getItemCount(): Int {
        return studentList.size
    }

    /**
     * student_list_item.xml 에 설정된 view 를 사용할 수 있도록
     * binding 처리를 해줄 Helper 클래스
     *
     * layout/student_list_item.xml
     *      파일을 binding 객체로 생성하는 코드
     */
    inner class StudentViewHolder(binding: StudentListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        // xml 파일의 view 요소들을 각각 개별 변수에 할당
        val txtStNum: TextView = binding.stNum
        val txtStName: TextView = binding.stName
        val txtStAddr: TextView = binding.stAddr
        val txtStTel: TextView = binding.stTel
    }

}


