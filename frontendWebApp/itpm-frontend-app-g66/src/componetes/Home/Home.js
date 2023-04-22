import React, { Component } from 'react'
import NavBar from '../NavBar/NavBar';
import MainPage from '../MainPage/MainPage';
 

class Home extends Component {
    constructor(props) {
        super(props);
    }
    state = {  }
    render() { 
        return (<div>
            <NavBar/>
            <MainPage/>
        </div>);
    }
}
 
export default Home;