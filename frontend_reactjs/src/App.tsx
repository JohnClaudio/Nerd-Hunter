import Home from './pages/home/Home';
import Navbar from './components/NavBar/Navbar'
import Footer from './components/Footer/Footer'
import ListaTema from './components/temas/ListaTema'
import Login from './pages/login/Login'
import CadastroUsuario from './pages/cadastrarUsuario/CadastrarUsuario'
import './App.css'
import { createTheme, ThemeProvider } from '@mui/material'
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import {Provider} from 'react-redux';
import store from './store/store';
import {ToastContainer} from 'react-toastify';

import 'react-toastify/dist/ReactToastify.css';
import ListaPostagem from './components/postagens/listapostagem/ListaPostagem';
import CadastroPost from './components/postagens/cadastroPost/CadastroPost';
import CadastroTema from './components/temas/cadastroTema/CadastroTema';
import DeletarPostagem from './components/postagens/deletarPostagem/DeletarPostagem';
import DeletarTema from './components/temas/deletarTema/DeletarTema';


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
    <Provider store={store}>
      <ToastContainer />
    <Router>
      <Navbar />
      <Switch>
        <div style={{ minHeight: '100vh' }}>

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
            <CadastroUsuario />
          </Route>
          <Route path='/temas'>
            <ListaTema />
          </Route>
          <Route path='/posts'>
            <ListaPostagem />
          </Route>

          <Route exact path='/formularioPostagem'>
            <CadastroPost />
          </Route>
          <Route exact path='/formularioPostagem/:id'>
            <CadastroPost />
          </Route>
          <Route exact path='/formularioTema'>
            <CadastroTema />
          </Route>
          <Route exact path='/formularioTema/:id'>
            <CadastroTema />
          </Route>
          <Route path='/deletarPostagem/:id'>
            <DeletarPostagem />
          </Route>
          <Route path='/deletarTema/:id'>
            <DeletarTema />
          </Route>


        </div>
      </Switch>
      <Footer />
    </Router>
    </Provider>
        </ThemeProvider>
 
);
}

export default App;