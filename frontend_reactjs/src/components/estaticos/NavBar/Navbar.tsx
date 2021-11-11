import React from 'react';
import { AppBar, Toolbar, Typography, Box } from '@mui/material';

function Navbar() {

    const [token, setToken] = useLocalStorage('token');
    let history = useHistory();

    function Lougout() {
        setToken('');
        history.push('/Login');
        alert('Usuario delogado com sucesso')
    }
    
    return (
        <>
            <AppBar position="static" style={{ backgroundColor: "#3F51B5" }}>
                <Toolbar variant="dense">
                    <Box style={{ cursor: "pointer" }} >
                        
                        <Typography variant="h5" color="inherit">
                            Nerd Hunter
                        </Typography>
                    </Box>

                    <Box display="flex" justifyContent="start">
                        
                        <Box mx={1} style={{ cursor: "pointer" }}>
                            <Typography variant="h6" color="inherit">
                                home
                            </Typography>
                        </Box>
                        <Box mx={1} style={{ cursor: "pointer" }}>
                            <Typography variant="h6" color="inherit">
                                postagens
                            </Typography>
                        </Box>
                        <Box mx={1} style={{ cursor: "pointer" }}>
                            <Typography variant="h6" color="inherit">
                                temas
                            </Typography>
                        </Box>
                        <Box mx={1} style={{ cursor: "pointer" }}>
                            <Typography variant="h6" color="inherit">
                                cadastrar tema
                            </Typography>
                        </Box>
                        <Box mx={1} style={{ cursor: "pointer" }}>
                            <Typography variant="h6" color="inherit">
                                logout
                            </Typography>
                        </Box>
                        
                    </Box>

                </Toolbar>
            </AppBar>
        </>
    )
}

export default Navbar;