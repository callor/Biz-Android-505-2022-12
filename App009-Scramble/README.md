# 안드로이드 viewModel 데이터 관리
* 안드로이드 App 에서는 Kotlin Jet-pack Compose 에서 제공하는 `viewModel`을
* 사용하여 데이터(단일변수, 배열, 객체 등등)를 화면에 표현하는 방법을 구현한다.

## viewModel 이란
* App 에 사용하는 데이터를 `viewModel` 이라는 `Observer` 가 변화되는 데이터를
* 감시하고 있다고, 데이터에 변화가 발생하면 변화된 데이터를 UI 화면에 반영해주는
* 기술적 메커니즘이다.
* 다른도구(react) 에서 사용하는 state 라는 개념과 유사하다.

## viewM을 사용하기 위한 dependencies 설정
* 메이븐 리파지토리에서 검색 : 검색어 `Android lifecyle`
```agsl
    def lifecycle_version = "2.5.1"
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
```
* Fragment 에서 LiveData 를 사용하기위한 dependency : 검색어 `Android fragment`
```agsl
    implementation 'androidx.fragment:fragment-ktx:1.5.5'
```
* view 와 viewModel 을 실시간으로 연결하기 위한 Observer 보조 조구
* 검색어 : `Android databinding`
```agsl
implementation 'androidx.databinding:databinding-runtime:7.3.1'
```

* dependencies 를 설정한 후 `File / Project Struct / Sugestion` 를 확인 하여 버전 확인
