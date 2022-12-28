package com.callor.app

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class PhoneCall : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_call)

        val txt_phone = findViewById<EditText>(R.id.txt_phone_number)
        val btn_call = findViewById<Button>(R.id.btn_call)
        val btn_phone = findViewById<Button>(R.id.btn_phone)

        btn_phone.setOnClickListener{
            val phoneNumber = txt_phone.text.toString()
            val phoneURI = Uri.parse("tel:${phoneNumber}")
            val  intent = Intent(Intent.ACTION_DIAL,phoneURI)
            startActivity(intent)
        }

        btn_call.setOnClickListener{

            /**
             * 안드로이드 전화걸기
             * phone 기기에 기본적으로 내장된 전화걸기 서비스를 호출하여
             * 전화 걸기
             * 호출하고자 하는 전화번호를 Uri 형태로 만들고,
             * Intent.ACTION_CALL intent 에게 전송하여 전화를 호출한다
             * 이때, 시스템에 권한이 있어야 실제 전화를 걸수 있다.
             *
             * 안드로이드 API 23 Level(마쉬멜로) 이상에서는 반드시 의무적으로
             * 권한을 부여할 것인지를 확인하는 절차가 필요하다
             * 확인 후 권한 부여를 승인하기 위하여 설정화면을 열고
             * 실제 권한 부여를 하는 코드가 필요하다.
             *
             * 여기에서는 권한 부여확인 및 설정코드를 생략했다
             * 이런경우 test 를 위하여
             * 임의로(수동으로) 설정 > 앱 > 해당 어플 > 권한 > 전화 권한을 허용해준다
             * 그리고 Manifest.xml 에 use-permission 항목에 CALL_PHONE 을 등록해야 한다
             */
            val phone_number = txt_phone.text.toString();
            val phone_URI = Uri.parse("tel:$phone_number")
            val phoneIntent = Intent(Intent.ACTION_CALL,phone_URI)
            startActivity(phoneIntent)
            /**
             * 안드로이드 시스템의 4가지 인텐트 컴포넌트
             * 1. 액티비티 인텐트 : 개발자 자신의 어플에 생성한 Activity
             * 2. 서비스 : 백그라운드에서 실행되는 요소
             *      - 만약 자신의 어플에서 일정시간마다 알람을 화면에 보이고 싶다
             *          이럴때는 프로젝트의 액티비티를 server 로 등록한다.
             *      - 네트워크 서비와 연동하기도 한다.
             *      - 어플이 종료되어도 서비스는 강제 종료 되지 않다.
             *
             * 3. 방송수신자 : 안드로이드가 발송하는 여러가지 이벤트와 정보를
             *      받고, 작동하는 액티비티
             *      방송발송자 : 안드로이드 OS
             *
             * 4. 컨텐트 제공자 : 데이터를 관리하고 다른 애플리케이션의 데이터를
             *      제공하는 컴포넌트트             *
             */
        }
    }
}