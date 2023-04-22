import React, { Component } from 'react'
import './NavBar.css'
import { Grid } from '@mui/material';
// import Avatar from '@mui/material';
// import dp from '../images/dp1.png';
import logo from '../../images/3.png';
import dp from '../../images/dp1.png';


class NavBar extends Component {
    constructor(props) {
        super(props);
    }
    state = {  }
    render() { 
        return (  
            <div>
                <div className="navbar_content">
                    <Grid container>
                        <Grid item xs={2}>
                            <center>
                                <img src={logo} className='logo'/>
                            </center>
                        </Grid>
                        <Grid item xs={2}></Grid>
                        <Grid item xs={2}>
                            <input type="text" className="searchNow" placeholder='Search Your Need..'/>
                        </Grid>
                        <Grid item xs={5} style={{"display":"flex"}}>
                            <div className="items">Home</div>
                            <div className="items">Articles</div>
                            <div className="items">Posting</div>
                            <div className="items">Join with Us</div>
                            <img src={dp} className='itemsAvatar'/>
                        </Grid>
                    </Grid>
                </div>
            </div>
        );
    }
}
 
export default NavBar;