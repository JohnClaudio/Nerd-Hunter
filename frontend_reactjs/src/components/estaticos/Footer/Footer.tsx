import React from 'react';

import InstagramIcon from '@mui/icons-material/Instagram';
import FacebookIcon from '@mui/icons-material/Facebook';
import LinkedInIcon from '@mui/icons-material/LinkedIn';
import {Typography, Box, Grid } from '@mui/material';
import { makeStyles } from '@mui/styles';


const useStyles = makeStyles({
    
    root:{
        width: '100vw',
        position: 'absolute',
        bottom:0,
        color:'white',
    },

    background: {
        background: '#303F9F',

    },

    icon:{
        fontSize: 60,
        color: 'white',
        
    }


    })

function Footer() {
   
    const classes = useStyles();
    return (
         <footer className={classes.root}>
            <Grid container direction="row" justifyContent="center" alignItems="center" >

                <Grid alignItems="center" item xs={12}>

                    <Box style={{ height: "120px" }}>
                        <Box paddingTop={1} display="flex" alignItems="center" justifyContent="center">
                            <Typography variant="h5" align="center" gutterBottom >Siga-nos nas redes sociais </Typography>
                        </Box>
                        <Box display="flex" alignItems="center" justifyContent="center">

                            <a href="https://www.facebook.com/generationbrasil" target="_blank">
                                <FacebookIcon className={classes.icon} />
                            </a>
                            <a href="https://www.instagram.com/generationbrasil/" target="_blank">
                                <InstagramIcon className={classes.icon} />
                            </a>
                            <a href="https://www.linkedin.com/school/generationbrasil/" target="_blank">
                                <LinkedInIcon className={classes.icon} />
                            </a>

                        </Box>
                    </Box>
                    <Box style={{  height: "60px" }} className={classes.background}>
                        <Box paddingTop={1}>
                            <Typography variant="subtitle2" align="center" gutterBottom >© 2020 Copyright:</Typography>
                        </Box>
                        <Box>
                            <a target="_blank" href="https://brasil.generation.org">
                                <Typography variant="subtitle2" gutterBottom align="center" style={ {color: "white" }} > brasild.generation.org</Typography>
                            </a>
                        </Box>
                    </Box>
                </Grid>
            </Grid>
        </footer>
        
    )
}

export default Footer;