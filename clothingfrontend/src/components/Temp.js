import * as React from 'react';
import Box from '@mui/material/Box';
import InputLabel from '@mui/material/InputLabel';
import MenuItem from '@mui/material/MenuItem';
import FormControl from '@mui/material/FormControl';
import Select from '@mui/material/Select';
import { ElevenMp } from '@mui/icons-material';

export default function TempSelect() {
  const [temp, setTemp] = React.useState('');

  const handleChange = (event) => {
    setTemp(event.target.value);
  };

  return (
    <Box sx={{ minWidth:130}}>
      <FormControl fullWidth>
        <InputLabel id="select-clothing-temp">Temperature</InputLabel>
        <Select
          labelId="select-clothing-temp"
          id="select-clothing-temp"
          value={temp}
          label="Temperature"
          onChange={handleChange}
        >
          <MenuItem value={"70 >"}>70 {'>'}</MenuItem>
          <MenuItem value={"40 - 70"}>40 - 70</MenuItem>
          <MenuItem value={"< 40"}>{'<'} 40</MenuItem>
        </Select>
      </FormControl>
    </Box>
  );


}