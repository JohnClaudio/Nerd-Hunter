import { Grid, Box, Typography, Button} from '@material-ui/core';
import React from 'react';
import './Home.css'


const Home = () =>{
    return(
        <>

        <Grid container direction="row" justifyContent="center" alignItems="center" style={{ backgroundColor: "#3F51B5" }}>
          
            <Grid alignItems="center" item xs={12} md={6}>
                <Box paddingX={20} >
                    <Typography variant="h3" gutterBottom color="textPrimary" component="h3" align="center" style={{ color: "white", fontWeight: "bold" }}>Seja bem vindo(a)!</Typography>
                    <Typography variant="h5" gutterBottom color="textPrimary" component="h5" align="center" style={{ color: "white", fontWeight: "bold" }}>expresse aqui os seus pensamentos e opiniões!</Typography>
                </Box>
                <Box display="flex" justifyContent="center">
                    <Box marginRight={1}>
                    </Box>
                    <Button variant="outlined" style={{ borderColor: "white", backgroundColor: "#3F51B5", color: "white" }}>Ver Postagens</Button>
                </Box>
            </Grid>

            <Grid item xs={12} md={6}>
                <img className="imagem"src="https://i.imgur.com/H88yIo2.png" alt="" />
            </Grid>
            <Grid xs={12} style={{ backgroundColor: "white" }}>
            </Grid>

        </Grid>
    </>
    );
}

export default Home;