import Home from './pages/home/Home';
import Navbar from './components/estaticos/NavBar/Navbar'
import Footer from './components/estaticos/Footer/Footer'
import Login from './pages/login/Login'
import './App.css'
import { createTheme, ThemeProvider } from '@mui/material'
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
function App() {

    const theme = createTheme({
        palette: {
            primary: {
                main: '#3F51B5',
                dark: '#303F9F',
            },


        },
    });

    return (

        <ThemeProvider theme={theme}>
            <Router>
                

                <Switch>
                    <div >
                    <Route exact path='/'>
              <Login />
              
            </Route>

            <Route path='/login'>
              <Login />
         
            </Route>

            <Route path='/home'>
              <Navbar />
              <Home />
              <Footer />
            </Route>
                    </div>
                </Switch>

             

            </Router>
        </ThemeProvider>
 
);
}

export default App;