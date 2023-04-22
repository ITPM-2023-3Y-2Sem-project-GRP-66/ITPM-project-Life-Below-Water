import React, { Component } from 'react'
import { Grid } from '@mui/material';
import backgroundImg1 from "../../images/SDG-14.gif";
import backgroundImg from "../../images/background.jpg";
import './MainPage.css'


class MainPage extends Component {
    constructor(props) {
        super(props);
    }
    state = {  }
    render() { 
        return (
        <div>

            <div className="main_container">
                <img src={backgroundImg} alt="" className="image-of-back" />
                <button className="join-button">Join With Us</button>
            </div>   

            <div className="sub-main_container">
          
                    <Grid container>

                        <Grid item xs={2}>
                            
                            <img src={backgroundImg1} alt="" className="gif" />
                                    
                        </Grid>

                        <Grid item xs={8}>

                        <div className="middleGridContainer">
                           <h1>CONSERVE AND SUSTAINABLY USE THE
                             OCEANS, SEAS AND MARINE RESOURCES FOR 
                             SUSTAINABLE DEVELOPMENT.</h1>
                            <p className='paragraph'>
                            Healthy oceans and seas are essential to our existence.They cover 70 percent of our planet and we rely on them for food,
                            energy and water. Yet, we have managed to do tremendous damage to these precious
                            resources. We must protect them by eliminating pollution and 
                            overfishing and immediately start to responsibly manage
                            and protect all marine life around the world.
                            </p>
                            <div className="buttonContainer">
                                <button className='btnResource'>Articles</button>
                                <button className='btnResource'>Posting</button>
                                <button className='btnResource'>Complains</button>
                            </div>
                            </div>

                        </Grid>
                        
                      
                    </Grid>
                </div>
        </div> 
        );
    }
}
 
export default MainPage;