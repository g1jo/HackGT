import * as React from 'react';
import Box from '@mui/material/Box';
import InputLabel from '@mui/material/InputLabel';
import MenuItem from '@mui/material/MenuItem';
import FormControl from '@mui/material/FormControl';
import Select from '@mui/material/Select';

export default function RainSelect() {
  const [rain, setRain] = React.useState('');

  const handleChange = (event) => {
    setRain(event.target.value);
  };

  return (
    <Box sx={{ minWidth:130}}>
      <FormControl fullWidth>
        <InputLabel id="select-clothing-rain">Is it Raining?</InputLabel>
        <Select
          labelId="select-clothing-rain"
          id="select-clothing-rain"
          value={rain}
          label="Raining"
          onChange={handleChange}
        >
          <MenuItem value={"Raining"}>Yes</MenuItem>
          <MenuItem value={"Not Raining"}>No</MenuItem>
        </Select>
      </FormControl>
    </Box>
  );
}