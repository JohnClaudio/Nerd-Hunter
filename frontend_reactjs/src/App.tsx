import Home from './pages/home/Home';
import Navbar from './components/estaticos/NavBar/Navbar'
import Footer from './components/estaticos/Footer/Footer'
import ListaPostagem from './components/estaticos/postagem/ListaPostagem'
import ListaTema from './components/estaticos/tema/ListaTema'
import Login from './pages/login/Login'
import CadastrarUsuario from './pages/cadastrarUsuario/CadastrarUsuario'
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
      <Navbar />
        <Switch>
          <div style={{minHeight: '100vh'}}>

            <Route exact path='/'>
              <Login />
            </Route>

            <Route path='/login'>
              <Login />
            </Route>

            <Route path='/home'>
              <Home />
            </Route>
            
            <Route path='/cadastrousuario'>
              <CadastrarUsuario />
            </Route>

            <Route path='/temas'>
            <ListaTema />
          </Route>

          <Route path='/posts'>
            <ListaPostagem />
          </Route>
          </div>
        </Switch>
      <Footer />
    </Router>
        </ThemeProvider>
 
);
}

export default App;