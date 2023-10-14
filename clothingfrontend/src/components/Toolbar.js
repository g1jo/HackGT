import * as React from 'react';
import { useNavigate } from 'react-router'
import AppBar from '@mui/material/AppBar';
import Box from '@mui/material/Box';
import Toolbar from '@mui/material/Toolbar';

const Toolbars = () => {
  const navigate = useNavigate();

    const handleClick3 = () => {
        navigate("/home", {replace: true});
    }

  return (
    <Box sx={{ flexGrow: 1 }}>
      <AppBar position="static">
        <Toolbar>
        <button onClick={handleClick3}>Home</button>
        </Toolbar>
      </AppBar>
    </Box>
  );
}

export default Toolbars;
