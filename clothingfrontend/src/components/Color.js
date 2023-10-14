import * as React from 'react';
import Box from '@mui/material/Box';
import InputLabel from '@mui/material/InputLabel';
import MenuItem from '@mui/material/MenuItem';
import FormControl from '@mui/material/FormControl';
import Select from '@mui/material/Select';

export default function ColorSelect() {
    const [color, setColor] = React.useState('');
  
    const handleChange = (event) => {
  
      setColor(event.target.value);
    };
  
    return (
      <Box sx={{ minWidth: 130 }}>
        <FormControl fullWidth>
          <InputLabel id="select-clothing-color">Color</InputLabel>
          <Select
            labelId="select-clothing-color"
            id="select-clothing-color"
            value={color}
            label="Color"
            onChange={handleChange}
          >
            <MenuItem value={"White"}>White</MenuItem>
            <MenuItem value={"Black"}>Black</MenuItem>
            <MenuItem value={"Gray"}>Gray</MenuItem>
            <MenuItem value={"Red"}>Red</MenuItem>
            <MenuItem value={"Orange"}>Orange</MenuItem>
            <MenuItem value={"Yellow"}>Yellow</MenuItem>
            <MenuItem value={"Green"}>Green</MenuItem>
            <MenuItem value={"Blue"}>Blue</MenuItem>
            <MenuItem value={"Purple"}>Purple</MenuItem>
            <MenuItem value={"Navy"}>Navy</MenuItem>
            <MenuItem value={"Brown"}>Brown</MenuItem>
          </Select>
        </FormControl>
      </Box>
    );
}