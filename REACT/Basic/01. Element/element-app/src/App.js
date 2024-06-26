import './App.css';
import React from 'react'

// 클래스형 컴포넌트
// class App extends React.Component{
// function App() {
//   render() {
//     // 리액트 자바스크립트로 생성
//     const link = React.createElement('a', {
//       href: 'http://www.google.com',
//       target: '_blank',
//       style: {color: 'blue'}
//     }, '구글 사이트')

//     const box = React.createElement('div', {
//       className:'box'
//     }, '컨테이너')

//     const element= React.createElement('div', null,
//       [link, box]
//     )


//     // 2. JSX 로 엘리먼트 생성
//     const element2 = (
      // <div>
      //   <h1>JSX 엘리먼트</h1>
      //   <a href="https://www.google.com"
      //      target='_blank'
      //      style={{color:'red'}}
      //   >구글 사이트</a>
      // </div>
//     )

//     return element2
//     // return link

//   }

// }

// 함수형 컴포넌트
function App() {
  return (
    // 프래그먼트
    <>
      <div>
        <h1>JSX 엘리먼트</h1>
        <a href="https://www.google.com"
           target='_blank'
           style={{color:'red'}}
        >구글 사이트</a>
      </div>
      <p>
        프래그먼트를 쓰면, 실제로는 상위태그가,
        랜더링 되지 않는다.
      </p>
    </>
  )
}

export default App;
